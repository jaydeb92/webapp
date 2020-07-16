<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<body>
	<div class="card text-center">
		<div class="card-header">Info of Natural Calamities</div>
		<div class="card-body">
			<h4>${message}</h4>
			<form action="register.do" method="post">
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Place</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="place" required="required">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Date</label>
					<div class="col-sm-6">
						<input type="date" class="form-control" name="date" required="required">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Captured By</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="capturedBy">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Calamity Type</label>
					<div class="col-sm-6">
						<select class="form-control" name="calamityType" required>
							<option></option>
							<option>Flood</option>
							<option>Rain</option>
							<option>Cyclone</option>
							<option>Earth Quake</option>
						</select>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Area</label>
					<div class="col-sm-6">
						<input type="textarea" class="form-control" name="area">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">Avg. Loss</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="avgLoss">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">No. Of Deaths</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="noOfDeaths">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 col-form-label">No. Of Injured</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" name="noOfInjured">
					</div>
				</div>

				<div class="form-group row">
					<div class="col-sm-10">
						<button type="submit" class="btn btn-primary">Register</button>
					</div>
				</div>
			</form>
		</div>
		<div class="card-footer text-muted"></div>
	</div>
</body>
</html>
