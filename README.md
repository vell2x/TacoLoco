# TacoLoco
Taco Loco, a quick service fleet of taco trucks, is building a new mobile app to enable their customers to place orders for their delicious tacos.

Code time estimate: 2.5 hours

JUnit Test estimate: 1.0 hour

Research(Javascript) estimate: 1.5 hours

Spring setup:

  Step 1: Go to https://start.spring.io/
  
  Step 2: Select "Packaging" War
  
  Step 3: Select "Dependencies" Web, and DevTools
  
  Step 4: Download zip then "Extract All"
  
  Step 5: Open Eclipse, right-click "Package Explorer" tab area
  
  Step 6: Import > Existing Maven Projects > Select Project
  
  Step 7: Add to "/TacoLoco/src/main/resources/application.properties":
  
          - spring.mvc.view.prefix=/WEB-INF/views/
          
          - spring.mvc.view.suffix=.jsp
  
