public class Get01 {
    /*
    1)Postman, manuel API testleri icin kullandik,
2)Otomasyon testleri icin de Rest Assured Library kullanacagiz.
3)Otomasyon testlerimizi yaparken asagidaki adimlari izliyoruz;
    a)Gereksinimleri anlamak,
    b)Test Case yaziyoruz
        i)Test Case yaziminda "Gherkin" dilini kullaniyoruz. Bizler yazilim diline hakim olsak da, karsimizdaki
        kisiler hakim olmayabilir, ama Gherkin ile yazilan testleri anlamakta zorluk cekmeyeceklerdir.
        Gherkin dilinde kullanacagimiz keywordler;

        -Given: On kosullar,
        -When : Yapilacak aksiyonlar icin (get(), put(), patch(), ve delete())
        -Then : Istek yaptiktan (request gonderdikten sonra) dogrulama
        -And  : Coklu islemlerde kullanacagiz

    c) Test kodlarimizi yazmaya baslayazagiz

           i)    Set the URL,
           ii)   Set the expected Data (beklenen datanin olusturulmasi, Post, Put, Patch)
           iii)  Type code to send request (Talep gondermek icin kod yazimi)
           iv)   Do Assertion (Dogrulama Yapmak)
     */

          /*
           Given
                   https://restful-booker.herokuapp.com/booking/101
               When
                   User sends a GET Request to the url
               Then
                   HTTP Status Code should be 200
               And
                   Content Type should be JSON
               And
                   Status Line should be HTTP/1.1 200 OK
            */


    }
