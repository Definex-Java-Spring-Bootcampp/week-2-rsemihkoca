[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/A05Yfs1j)
# 2.Hafta Ödevi

**1. Senkron ve Asenkron iletişim nedir örneklerle açıklayın? `(10 PUAN)`** 

   Senkron iletişimde veri iletimi belirli bir zamanlama veya saat sinyaliyle senkronize edilirken, asenkron iletişimde ise böyle bir zamanlama mekanizması kullanılmaz ve veri iletimi bağımsızdır.

   Örnek olarak, telekomünikasyon ağlarında kullanılan TDM senkron iletişim örnekleri olarak gösterilebilir. Asenkron iletişimde, veri paketleri birbirinden bağımsız olarak gönderilir ve alınır. Örneğin, internet üzerindeki TCP/IP protokolü asenkron iletişimin bir örneğidir. E-posta gönderme işlemi de asenkron iletişime bir örnektir; gönderen e-postayı gönderdiğinde, alıcı e-postayı alabilir ancak bunun ne zaman olduğu göndericiden bağımsızdır.

**2. RabbitMQ ve Kafka arasındaki farkları araştırın? `(10 PUAN)`**


RabbitMQ, geleneksel mesaj kuyruğu senaryoları için uygunken, Kafka büyük ölçekli veri işleme ve gerçek zamanlı veri akışları için daha uygundur.

Kullanım Senaryoları:

RabbitMQ, klasik mesaj kuyruğu senaryolarında tercih edilir. Özellikle işlemli bir yapıda iletişim gerektiren durumlarda kullanılır.
Kafka, büyük veri akışlarını işleme ve gerçek zamanlı veri akışlarını işleme konusunda güçlüdür. Özellikle büyük ölçekli veri işleme ve analitik gereksinimleri için tercih edilir.

İletişim Modeli:

RabbitMQ, yaygın olarak bir istemci/sunucu modeli kullanır. İstemci, RabbitMQ sunucusuna bağlanır ve mesajları üretir veya tüketir.
Kafka ise dağıtık bir olay günlüğü olarak tasarlanmıştır. İstemciler doğrudan Kafka kümelerine bağlanır ve mesajları işler.

Ölçeklenebilirlik:

RabbitMQ, genellikle tek bir sunucu üzerinde çalışır ve dikey ölçeklenebilirlik sunar (yani, daha fazla işlemci ve bellek ile ölçeklendirilebilir).
Kafka, yatay ölçeklenebilirlik sunar. Bu, Kafka kümesine yeni sunucular eklenerek ve böylece daha fazla veri akışını işleyebilir hale getirilerek gerçekleştirilir.

Mesaj Saklama Süresi:

RabbitMQ'da mesajlar tüketildikten sonra varsayılan olarak silinir.
Kafka'da ise mesajlar, belirlenen bir süre boyunca saklanır veya bir depolama sınırına ulaşılana kadar depolanır.

**3. Docker ve Virtual Machine nedir? `(5 PUAN)`**

Docker konteynerleri, işletim sistemi seviyesinde izole edilmiş hafif sanal ortamlardır. Her bir Docker konteyneri, uygulamanın çalışması için gerekli tüm bağımlılıkları ve kütüphaneleri içerir.
Docker konteynerleri, bir ana işletim sistemi çekirdeği üzerinde çalışır ve bu nedenle sanal makinelerden daha hafif ve hızlıdır. Ölçeklendirmek ve yönetmek için popüler bir seçenektir.

Sanal Makine, fiziksel bir bilgisayar üzerinde, bir bilgisayarın donanımını ve işletim sistemini sanal olarak simüle eden bir yazılım tabanlı ortamdır.
Her sanal makine, kendi işletim sistemi örneği ve uygulama yüklerini barındırabilir. Bu nedenle, her bir sanal makine bağımsız bir ortam sağlar.
Sanal makineler, genellikle daha fazla kaynak tüketir ve başlatma/sürdürme süreleri Docker konteynerlerinden daha uzun olabilir.
Sanal makineler, farklı işletim sistemleri ve uygulama yükleri için daha yüksek izolasyon seviyesi sağlar.

**4. Docker ile RabbitMQ ve PostgreSQL ve ya MySQL kurulumu yapın? `(5 PUAN)`**

.env, docker-compose.yml dosyasını inceleyebilirsiniz.

**5. Docker komutlarını örneklerle açıklayın. `(5 PUAN)`**

docker container ls: çalışan konteynerları listeler.

docker image prune: gereksiz imajları siler.

docker volume prune: gereksiz volume'leri siler.

docker run: Bir konteyneri başlatmak için kullanılır.

docker pull: Bir imajı indirmek için kullanılır.

docker ps: Çalışan konteynerleri listeler.

docker stop: Çalışan bir konteyneri durdurur.

docker images: İmajları listeler.

docker rm: Bir veya birden fazla konteyneri siler.

docker exec: Bir konteyner içinde komut çalıştırmak için kullanılır.

docker build: Bir Docker imajını oluşturmak için kullanılır.

docker-compose up: Docker-compose dosyasındaki servisleri başlatır.

docker-compose down: Docker-compose dosyasındaki servisleri durdurur ve temizler.

6. Microservice ve Monotlith mimarilerini kıyaslayın. `(15 PUAN)`

7. API Gateway, Service Discovery, Load Balancer kavramlarını açıklayın. `(10 PUAN)`

8. Hibernate, JPA, Spring Data framework’lerini örneklerle açıklayın. `(10 PUAN)`

9. [**KredinBizde**](https://github.com/Definex-Java-Spring-Bootcampp/kredinbizde-service) Uygulamasına aşağıdaki özellikleri ekleyin. `(30 PUAN)`
    - Email adresi ile kullanıcının bütün başvurularını listeleyen end-point’i yazın.
    - Bankaların kredi kartlarını ve bu kartların kampanyalarını listeleyen end-point’i yazın.
    - Sistemdeki bütün kampanyaları en güncelden eski tarihe doğru listeleyen end-point’i yazın.
    - Kredi başvurularını kaydeden end-point’i yazın.
---
*Eğitmen - Cem DIRMAN*  
*Kolay Gelsin*
