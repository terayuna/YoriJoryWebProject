<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
 <title>ȸ������ ������</title>
 </head>

 <body>
     <center>
     
     <a href="MainByMimi.html"> <img
	src="${pageContext.request.contextPath}/content/images/yorijorybig.png"
	alt="yorijory" /></a>

     <div>
     <table border="1" >
         <tr>
             <td width="100">���̵�</td>
             <td width="450">
             <form action="idcheck.jsp" method="get" > 
             
                     <input type="text" name="id" autofocus required></input>
                     <input type="submit" value="���̵� �ߺ�Ȯ��"> </input>
                 </form>           
             </td>
         </tr>
        
         <tr>
             <td>��й�ȣ</td>
             <td>
         
                  <form action="passwordcheck.jsp" method="post" > 
                     <font>��й�ȣ �Է�</font>
                     <input type="password" name="password"></input>
                     <br />
                     <font>��й�ȣ Ȯ��</font>
                     <input type="password" name="password_comf"></input>
                     <br />
                    
                 </form>
             </td>
         </tr>
                
         <tr>
             <td>�̸�</td>
             <td>
                 <input type="text" name="name"></input>
             </td>
         </tr>
        
         <tr>
             <td>�������</td>
             <td>
                    <input type="text" name="year" value="��)2015���  >> 2015"></input>
                 <select>
                     <option>1��</option>
                     <option>2��</option>
                     <option>3��</option>
                     <option>4��</option>
                     <option>5��</option>
                     <option>6��</option>
                     <option>7��</option>
                     <option>8��</option>
                     <option>9��</option>
                     <option>10��</option>
                     <option>11��</option>
                     <option>12��</option>
                 </select>
                 <select>
                     <option>1��</option>
                     <option>2��</option>
                     <option>3��</option>
                     <option>4��</option>
                     <option>5��</option>
                     <option>6��</option>
                     <option>7��</option>
                     <option>8��</option>
                     <option>9��</option>
                     <option>10��</option>
                     <option>11��</option>
                     <option>12��</option>
                     <option>13��</option>
                     <option>14��</option>
                     <option>15��</option>
                     <option>16��</option>
                     <option>17��</option>
                     <option>18��</option>
                     <option>19��</option>
                     <option>20��</option>
                     <option>21��</option>
                     <option>22��</option>
                     <option>23��</option>
                     <option>24��</option>
                     <option>25��</option>
                     <option>26��</option>
                     <option>27��</option>
                     <option>28��</option>
                     <option>29��</option>
                     <option>30��</option>
                     <option>31��</option>
                 </select>
                 <input type="radio" name="day_type"/> ���
                <input type="radio" name="day_type"/> ����
            </td> 
         </tr>
        
         <tr>
             <td>��ȭ��ȣ</td>
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
             <td>�ּ�</td>
             <td>
                 <input type="text" name="address"></input>
             </td> 
         </tr>
  
        
         <tr>
             <td>�ڱ�Ұ�</td>
             <td>
                 <textarea cols="30" rows="3">+</textarea>
             </td>
         </tr>
     </table>
    
     <form action="submit.jsp" method="get">
         <input type="submit" value="ȸ������"> </input>
        
     </form> 
     
     </div>
     </center>

 </body>
 </html>