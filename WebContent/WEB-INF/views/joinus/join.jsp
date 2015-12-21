<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <title>회원가입 페이지</title>
 </head>

 <body>
     <center>
     
     <a href="MainByMimi.html"> <img
	src="${pageContext.request.contextPath}/content/images/yorijorybig.png"
	alt="yorijory" /></a>

     <div>
     <table border="1" >
         <tr>
             <td width="100">아이디</td>
             <td width="450">
             <form action="idcheck.jsp" method="get" > 
             
                     <input type="text" name="id" autofocus required></input>
                     <input type="submit" value="아이디 중복확인"> </input>
                 </form>           
             </td>
         </tr>
        
         <tr>
             <td>비밀번호</td>
             <td>
         
                  <form action="passwordcheck.jsp" method="post" > 
                     <font>비밀번호 입력</font>
                     <input type="password" name="password"></input>
                     <br />
                     <font>비밀번호 확인</font>
                     <input type="password" name="password_comf"></input>
                     <br />
                    
                 </form>
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
                    <input type="text" name="year" value="예)2015년생  >> 2015"></input>
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
                 <input type="radio" name="day_type"/> 양력
                <input type="radio" name="day_type"/> 음력
            </td> 
         </tr>
        
         <tr>
             <td>전화번호</td>
             <td>
                 <input type="text" name="telephoneNo"></input>
             </td> 
         </tr>

         <tr>
             <td>E-Mail</td>
             <td>
                 <input type="text" name="email"></input>
             </td> 
         </tr>

         <tr>
             <td>주소</td>
             <td>
                 <input type="text" name="address"></input>
             </td> 
         </tr>
  
        
         <tr>
             <td>자기소개</td>
             <td>
                 <textarea cols="30" rows="3">+</textarea>
             </td>
         </tr>
     </table>
    
     <form action="submit.jsp" method="get">
         <input type="submit" value="회원가입"> </input>
        
     </form> 
     
     </div>
     </center>

 </body>
 </html>