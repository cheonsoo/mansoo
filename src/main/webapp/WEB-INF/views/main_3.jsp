<!DOCTYPE html>
<html>
<head>
    <title>jQuery slimMenu</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" type="text/css" href="http://meyerweb.com/eric/tools/css/reset/reset.css">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/resources/plugins/slimmenu/slimmenu.css">
    
    <style>
        body {
            font-family: 'Lucida Sans Unicode', 'Lucida Console', sans-serif;
            padding: 0;
        }
        a, a:active { text-decoration: none }
    </style>
    
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</head>
<body>
	<ul class="slimmenu">
		<li><a href="/mansoo/main">home</a></li>
		<li><a href="/mansoo/main/?body=/contact">contact</a></li>
	    <li>
	        <a href="#">Slim Menu 1</a>
	        <ul>
	            <li>
	                <a href="#">Slim Menu 1.1</a>
	                <ul>
	                    <li><a href="#">Slim Menu 1.1.1</a></li>
	                    <li>
	                        <a href="#">Slim Menu 1.1.2</a>
	                        <ul>
	                            <li><a href="#">Slim Menu 1.1.2.1</a></li>
	                            <li><a href="#">Slim Menu 1.1.2.2</a></li>
	                        </ul>
	                    </li>
	                </ul>
	            </li>
	            <li><a href="#">Slim Menu 1.2</a></li>
	        </ul>
	    </li>
	    <li><a href="#">Slim Menu 2</a></li>
	    <li>
	        <a href="#">Slim Menu 3</a>
	        <ul>
	            <li>
	                <a href="#">Slim Menu 3.1</a>
	                <ul>
	                    <li><a href="#">Slim Menu 3.1.1</a></li>
	                    <li><a href="#">Slim Menu 3.1.2</a></li>
	                </ul>
	            </li>
	            <li><a href="#">Slim Menu 3.2</a></li>
	        </ul>
	    </li>
	    <li><a href="#">Slim Menu 4</a></li>
	</ul>
	
	<script src="<%= request.getContextPath() %>/resources/plugins/slimmenu/jquery.slimmenu.js"></script>
	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script>
	$('ul.slimmenu').slimmenu(
	{
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