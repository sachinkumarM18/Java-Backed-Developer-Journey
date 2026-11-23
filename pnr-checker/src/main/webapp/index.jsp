
<!DOCTYPE html>
<html>
<head>
<title>IRCTC PNR Check</title>

<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, sans-serif;
}

body {
	background: #f1f5f9;
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
}

.container {
	width: 420px;
	background: #ffffff;
	border-radius: 12px;
	overflow: hidden;
	box-shadow: 0 5px 20px rgba(0, 0, 0, 0.12);
}

.header {
	background: #003b73;
	color: white;
	text-align: center;
	padding: 25px 15px;
	border-bottom: 5px solid #ff9933;
}

.header h2 {
	font-size: 24px;
	letter-spacing: 1px;
}

.header p {
	margin-top: 8px;
	font-size: 13px;
	color: #e0eaf5;
}

.content {
	padding: 30px;
	text-align: center;
}

.content h3 {
	color: #003b73;
	margin-bottom: 10px;
}

.content p {
	color: #666;
	font-size: 14px;
	margin-bottom: 25px;
}

.btn {
	display: block;
	text-decoration: none;
	padding: 14px;
	margin: 15px 0;
	border-radius: 6px;
	font-weight: bold;
	transition: 0.3s;
}

.primary {
	background: #003b73;
	color: white;
}

.primary:hover {
	background: #0056a6;
}

.secondary {
	background: #ff9933;
	color: #ffffff;
}

.secondary:hover {
	background: #e68116;
}

.footer {
	background: #f8fafc;
	padding: 15px;
	text-align: center;
	color: #777;
	font-size: 12px;
}
</style>
</head>

<body>

	<div class="container">

		<div class="header">
			<h2>IRCTC</h2>
			<p>Indian Railway Catering and Tourism Corporation</p>
		</div>

		<div class="content">

			<h3>PNR Services</h3>
			<p>Choose an option to continue</p>

			<a href="checkPNR" class="btn primary"> Check PNR Status </a> <a
				href="validateCaptcha" class="btn secondary"> Validate Captcha </a>

		</div>

		<div class="footer">Indian Railways | Passenger Services</div>

	</div>

</body>
</html>
