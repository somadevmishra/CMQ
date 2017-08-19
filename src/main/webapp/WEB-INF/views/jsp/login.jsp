<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<div class="container">
	<div id="loginbox" style="margin-top: 50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Sign In</div>
				<div
					style="float: right; font-size: 80%; position: relative; top: -10px">
					<!-- Yet to implement -->
					<a href="#">Forgot password?</a>
				</div>
			</div>
			
			<div style="padding-top: 30px" class="panel-body">
				<div style="display: none" id="login-alert"	class="alert alert-danger col-sm-12">
					<form:errors/>				
				</div>
				<form:form id="loginform" class="form-horizontal" role="form" action="cmq/login" modelAttribute="loginForm" method="post">
					<!-- Setting he username error to a variable -->
					<c:set var="usernameHasError">
					 	<form:errors path="username"/>
					 </c:set>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
						<form:input path="username" class="form-control" name="username" value="" placeholder="username or email" />
						<div class=${not empty usernameHasError ?"alert-danger": "display:none" }>
							<form:errors path="username"  />
						</div>
					</div>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
						<form:password path="password" class="form-control" name="password" placeholder="password" />
						<div class=${not empty '<form:errors path="password"/>'?"alert-danger":"display:none"}>
							<form:errors path="password" />
						</div>
					</div>
					 
					
					
					<!--    
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>
						-->
					<div style="margin-top: 10px" class="form-group">
						<!-- Button -->
						<div class="col-sm-6">
							<button id="btn-login" class="btn-info" type="submit">Login</button>
							
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>