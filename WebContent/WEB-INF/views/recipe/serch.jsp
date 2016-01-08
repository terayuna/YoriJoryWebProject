<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=yes"> -->
<style>
   #container{
   display:flex;
   /* 높이와 영역을 따로 설정하지 않으면 부모에 크기에 따라 등배된다. */
   background:pink;
   /* flex-direction: column; */
   /* flex-flow:column; 과 flex-direction 둘다 같은 의미*/
   flex-flow:column;
   /* flex-flow:row; */
   flex-wrap:wrap;
   /* div높이를 지정하지 않으면 비율로 설정이 된다. */
   height:300px;
   width:400px;
   
   font-size:30px;
   
/*    flex는 수직이나 수평으로 쌓는 것을 의미한다. */
   
   }
   
   body{
      background: gold;
      flex-flow:column;
      flex-wrap:wrap;
      display: flex;
      
   }
   
   #main{
      background:purple;
      min-height:300px;
      flex-flow:row;
      display:flex;
      
   
   }
   
   #header{
      background:yellow;
      height:70px;
   }
   #visual{
   	  /* width:400px; */
      background:pink;
      height:100px;
   }
   #body{
      background:green;
      flex:1;
      
   }
   #aside{
      background:white;
      width:200px;
   
   }
   #footer{
      background:blue;
      height:100px;
   }
   


   /* All Device */
      /* 모든 해상도를 위한 공통 코드를 작성한다. 모든 해상도에서 이 코드가 실행됨. */
   
   /* Mobile Device */
      /* 768px 미만 해상도의 모바일 기기를 위한 코드를 작성한다. 모든 해상도에서 이 코드가 실행됨. 미디어 쿼리를 지원하지 않는 모바일 기기를 위해 미디어 쿼리 구문을 사용하지 않는다. */
   
   /* Tablet & Desktop Device */
    @media all and (min-width:768px) {
      /* 사용자 해상도가 768px 이상일 때 이 코드가 실행됨. 테블릿과 데스크톱의 공통 코드를 작성한다. */
      #aside{
            background:red;
         }
    }
   
   /* Tablet Device */
  /*   @media all and (min-width:768px) and (max-width:1024px) {
      /* 사용자 해상도가 768px 이상이고 1024px 이하일 때 이 코드가 실행됨. 아이패드 또는 비교적 작은 해상도의 랩탑이나 데스크톱에 대응하는 코드를 작성한다. */
      #aside{
            background:green;
         }
    } */
   
   /* Desktop Device */
    @media all and (min-width:1025px) {
      /* 사용자 해상도가 1025px 이상일 때 이 코드가 실행됨. 1025px 이상의 랩탑 또는 데스크톱에 대응하는 코드를 작성한다. */
      #aside{
            background:blue;
         }
    }
   


</style>
</head>
<body>
  <!--  <header id = header>header</header> -->
   <div id = visual>visual</div>
   <main id = main>
     <!--  <div id ="aside">aside</div> -->
      <div id = "body">body</div>
      </main>
   <footer id = "footer">footer</footer>

   <!-- <div id = "container">
   <div style = "background:red; width:200px; height:150px; order:2; ">1</div>
   <div style = "background:green; width:200px; height:150px; order:1;">2</div>
   <div style = "background:blue; width:200px; height:150px; order:4;">3</div>
   <div style = "background:pink; width:200px; height:150px; order:3;">4</div>
   order를 따로 지정하지 않으면 순차적으로 표시된다.
   
   <div style = "background:green; flex:1;">2</div>
   <div style = "background:blue; flex:1;">3</div>
   flex는 비율을 뜻홤
   </div> -->
</body>
</html>