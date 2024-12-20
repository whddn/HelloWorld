<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8' />
<script src='./dist/index.global.js'></script>
<script>

  document.addEventListener('DOMContentLoaded', function() {
	let eventData;
	
	//eventData에 저장하기 fullData.do
	fetch('fullData.do')
		.then(result => result.json())
      	.then(result => {
			eventData = result;      		  
      	
	
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
      headerToolbar: {
        left: 'prev,next today',
        center: 'title',
        right: 'dayGridMonth,timeGridWeek,timeGridDay'
      },
      initialDate: '2024-12-12',
      navLinks: true, // can click day/week names to navigate views
      selectable: true,
      selectMirror: true,
      select: function(arg) {
        var title = prompt('이벤트를 등록하세요:');
        if (title) {
        	console.log(arg); // arg 확인
        	// Ajax 호출
        	fetch('addEvent.do?a='+title+'&b='+arg.startStr+'&c='+arg.endStr)
        		.then(result => result.json())
        		.then(result => {
        			if(result.retCode == 'OK'){
        			// 화면출력
			        	calendar.addEvent({
			            title: title,
			            start: arg.start,
			            end: arg.end,
			            allDay: arg.allDay
			           })
			      	 } // end of retCode == 'OK'
			    })
          		.catch(err => console.log(err));
        } // 화면출력
        
        calendar.unselect()
      },
      eventClick: function(arg) {
        if (confirm('Are you sure you want to delete this event?')) {
        	console.log(arg);
        	fetch('removeEvent.do?title='+arg.event.title+'&start_date='+arg.event.startStr+'&end_date='+arg.event.endStr)
        		.then(result => result.json())
        		.then(result =>{
        			if(result.retCode == 'OK'){
				          arg.event.remove()
        			}
        		})
        		.catch(err => console.log(err));
        		
        }
      },
      editable: true,
      dayMaxEvents: true, // allow "more" link when too many events
      events: eventData // [{}, {}, {} ....{}]
    }); 
    calendar.render();
      	})
      	.catch(err => console.log(err));
  });

</script>
<style>
body {
	margin: 40px 10px;
	padding: 0;
	font-family: Arial, Helvetica Neue, Helvetica, sans-serif;
	font-size: 14px;
}

#calendar {
	max-width: 1100px;
	margin: 0 auto;
}
</style>
</head>
<body>

	<div id='calendar'></div>

</body>
</html>
