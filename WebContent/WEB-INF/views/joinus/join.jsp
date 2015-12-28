<%-- <%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <title>회원가입 페이지</title>
 </head>

 <body>
     <center>
     
     <a href="MainByMimi.html"> 
     <img src="${pageContext.request.contextPath}/content/images/yorijorybig.png"alt="yorijory" /></a>
	
	
     <div>
     <form action="join" method="post">
     <table border="1" >
         <tr>
             <td width="100">아이디</td>
             <td width="450">
             <!-- <form action="" method="post" >  -->
             
                     <input type="text" name="mid" ></input>  <!-- autofocus required -->
                     <!-- <input type="submit" value="아이디 중복확인"> </input> -->
                 <!-- </form> -->           
             </td>
         </tr>
        
         <tr>
             <td>비밀번호</td>
             <td>
         
                   <!-- <form>  --> 
                     <font>비밀번호 입력</font>
                     <input type="password" name="pwd"></input>
                     <br />
                     <!-- <font>비밀번호 확인</font>
                     <input type="password" name="password_comf"></input>
                     <br /> -->
                    
                 <!-- </form> -->
             </td>
         </tr>
                
         <tr>
             <td>이름</td>
             <td>
                 <input type="text" name="name"></input>
             </td>
         </tr>
        
         <tr>
             <td>생년월일</td>
             <td>
                    <input type="text" name="year" value=""></input>
                 <select>
                     <option>1월</option>
                     <option>2월</option>
                     <option>3월</option>
                     <option>4월</option>
                     <option>5월</option>
                     <option>6월</option>
                     <option>7월</option>
                     <option>8월</option>
                     <option>9월</option>
                     <option>10월</option>
                     <option>11월</option>
                     <option>12월</option>
                 </select>
                 <select>
                     <option>1일</option>
                     <option>2일</option>
                     <option>3일</option>
                     <option>4일</option>
                     <option>5일</option>
                     <option>6일</option>
                     <option>7일</option>
                     <option>8일</option>
                     <option>9일</option>
                     <option>10일</option>
                     <option>11일</option>
                     <option>12일</option>
                     <option>13일</option>
                     <option>14일</option>
                     <option>15일</option>
                     <option>16일</option>
                     <option>17일</option>
                     <option>18일</option>
                     <option>19일</option>
                     <option>20일</option>
                     <option>21일</option>
                     <option>22일</option>
                     <option>23일</option>
                     <option>24일</option>
                     <option>25일</option>
                     <option>26일</option>
                     <option>27일</option>
                     <option>28일</option>
                     <option>29일</option>
                     <option>30일</option>
                     <option>31일</option>
                 </select>
                <!--  <input type="radio" name="day_type"/> 양력
                <input type="radio" name="day_type"/> 음력 -->
            </td> 
         </tr>
        
         <tr>
             <td>전화번호</td>
             <td>
                 <input type="text" name="phone"></input>
             </td> 
         </tr>

         <tr>
             <td>E-Mail</td>
             <td>
                 <input type="text" name="email"></input>
             </td> 
         </tr>
        
   
     </table>
    
    <!--   <form action="" method="post">  -->
         <input type="submit" value="join"/> 
      <!-- </form> -->
     </form>
     </div>
     </center>
     

 </body>
 </html>