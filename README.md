 Objetivo:
 
 Se deben implementar dos microservicios.
 Cada uno de ellos debe poder realizar las operaciones CRUD para cualquiera que
 sea su modelo de base. A su vez, uno de estos microservicios debe consumir
 información generada por el otro y utilizarla a nivel lógico (hacer algo con ella). Esto
 podrá ser realizado a partir de UNA de las siguientes implementaciones.
 
 Servicio A------------- (restClient)------------------> Servicio B
 
 Servicio A------ (Feign Client )--------> Eureka Server------------> Servicio B
 

 
