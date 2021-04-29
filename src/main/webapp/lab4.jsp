<%-- 
    Document   : lab4
    Created on : 22 квіт. 2021, 22:27:43
    Author     : Mark
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lab 4</h1>

        <h2>Варіант 12</h2>
        
        <h2>Текст для завдання</h2>
        
        <h4 align="center">The challenges for scalable fonts are the support-software overhead and the hinting required for more compact renderings. Some fonts are designed for high resolution or print applications, and their hinting doesn’t necessarily translate into efficient and good-looking fonts on a lower-resolution display. 
            What Monotype has done is bring this scalable capability to the low- and mid-range hardware spectrum, including manual and automatic hinting. New products include iType Spark and WorldType Shaper Spark. The iType Spark platform, which generates bitmap fonts, supports language types like Latin and Chinese that have unique fonts per character. 
            Though there may be proportional spacing between characters, each glyph is distinct. WorldType Shaper Spark handles more complex scenarios that involve combining multiple character glyphs into a larger combination. This approach is used for languages such as Hebrew, Thai, Devenagri, and Arabic. WorldType Shaper Spark handles complex and bidirectional scripts. 
            The iType Spark platform uses 20 kB of RAM and under 100 kB of flash. WorldType Shaper Spark takes a little more, but is only needed if there are more complex languages. The memory and processing requirements allow either platform to work with microcontrollers and low-end x86 processors. The output for iType Spark can be monochrome, 8-bit grayscale, or outlines. 
            It supports Monotype lightweight hints and performs its own auto-hinting. There’s support for TrueType fonts as well, but the best-quality fonts will be the Monotype Spark fonts. The base system includes a number of them. Monotype has already delivered the platforms on four development boards with displays—the Keil STM 23 EXL, NXP XPRESSO LPC1769, Microchip PIC32 board, and Renesas SH7264. 
            Support for the iType Spark and WorldType Shaper Spark can easily translate onto other platforms and displays.</h4>
        

        <h2>Визначити загальних кількість слів в тексті:</h2>
        <h2><%=request.getAttribute("task2")%></h2>
        
        <h2>Визначити кількість унікальних слів в тексті:</h2>
        <h2><%=request.getAttribute("task3")%></h2>
        
        <h2>Визначити перші 3 слів, що зустрічаються найчастіше:</h2>
        <h2><%=request.getAttribute("task4")%></h2>
        
        <h2>Визначити кількість слів що не містять літеру p:</h2>
        <h2><%=request.getAttribute("task5")%></h2>
        
        <h2>Визначити кількість слів, що мають рівно 2 однакових літер:</h2>
        <h2><%=request.getAttribute("task6")%></h2>       
        
        <h2>Визначити перші 3 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше:</h2>
        <h2><%=request.getAttribute("task7")%></h2>
    </body>
</html>
