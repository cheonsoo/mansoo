<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" type="text/css" href="http://meyerweb.com/eric/tools/css/reset/reset.css">
	<link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/common.css" />
	<link type="text/css" rel="stylesheet" href="<%= request.getContextPath() %>/resources/plugins/slimmenu/slimmenu.css" />
	
	<script src="<%= request.getContextPath() %>/resources/plugins/slimmenu/jquery.easing.min.js"></script>
	
	<!-- <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script> -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	
	<script type="text/script">
		$('#navigation').slimmenu({
    		resizeWidth: '800',
    		collapserTitle: 'Main Menu',
    		animSpeed: 'medium',
    		easingEffect: null,
    		indentChildren: false,
    		childrenIndenter: '&nbsp;'
		});
	</script>
	
</head>

<body> 
	
	<jsp:include page="./top_nav.jsp" />
	
	<div class="mainOuter">
		<div class="mainDiv">
			<div>
				
				<div id="bodyContents">
					<jsp:include page="${body}" />
				</div>
				
				<div id="footer">
				</div>
			</div>
		</div>
	</div>
	
	<script src="<%= request.getContextPath() %>/resources/plugins/slimmenu/jquery.slimmenu.min.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script>
		$('ul.slimmenu').slimmenu({
		    resizeWidth: '800',
		    collapserTitle: 'Main Menu',
		    easingEffect:'easeInOutQuint',
		    animSpeed:'medium',
		    indentChildren: true,
		    childrenIndenter: '&raquo;'
		});
	</script>

</body>
</html>