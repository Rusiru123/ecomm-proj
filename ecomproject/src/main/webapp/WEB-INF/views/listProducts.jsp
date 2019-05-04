<div class = "container">
		<div class = "row">
				
				<!-- Display the side bar -->
				
				<div class = "col-md-3">
						
				  <%@include file = "./shared/sidebar.jsp" %>		
						
				</div>
				
				<!-- Display The Products -->
				<div class = "col-md-9">
				
					<!-- Add The breadcrumb component -->
					<div class="row">
					
						<div class="col-lg-12">
						 
						 	<ol class="breadcrumb">
						 	
						 		<li><a href="home">Home</a></li>
						 		<li class="active">All Products</li>
						 		
						 	</ol>
						 	
						 	<ol class="breadcrumb">
						 	
						 		<li><a href="home">Home</a></li>
						 		<li class="active">Category</li>
						 		<li class="active">${category.name}</li>
						 		
						 	</ol>
						 		
						 	</div>
						
						</div>
					
					</div>
				
				
				</div>
		
		</div>

</div>