SELECT '        Consulta 1'; 
--select pel_titulo titulo from pelicula
--union
--select ser_titulo titulo from serie
--order by 1 asc;
select 'El imaginario del doctor parnassus' ;
select 'El señor de los anillos' ;
select 'Harry Potter' ;
select 'Juego de tronos' ;
select 'La orden secreta' ;
select 'Las crónicas de Narnia';
select 'Los originales' ;
select 'Once upon a time' ;
select 'Outlander' ;
select 'Sleepy Hollow' ;
select 'Stardust' ;
select 'Stranger Things' ;
select 'Supernatural' ;
select 'The Flash' ;
SELECT 'Consulta 2';
select'Harry Potter|Harry Potter es un niño huérfano criado por su tío Vernon y su tía Petunia que lo odian. Desde que era pequeño, estos siempre le han contado que sus padres murieron en un accidente de coche.El día de su decimoprimer cumpleaños, Harry recibe la inesperada visita de un hombre gigantesco de nombre Rubeus Hagrid. Este le revela que es, de hecho, hijo de dos poderosos magos y que él también posee extraordinarios poderes. Lleno de alegría, el chico acepta ir a estudiar a Hogwarts, el famoso colegio de magia y hechicería. Por fin, tiene la oportunidad de hacer amigos. Odiado por Severus Snape, profesor de Pociones, y protegido por Albus Dumbledore, director del colegio, Harry intentará dilucidar el misterio de la piedra filosofal.|2001';
select'El señor de los anillos|el joven y tímido hobbit, Frodo Bolsón, hereda un anillo. Lejos de ser una simple baratija, se trata del Anillo único, un instrumento de poder que permitiría a Sauron, el Señor Oscuro, reinar en la Tierra Media y convertir en esclavos a sus habitantes. Frodo, con la ayuda de una Compañía formada por hobbits, hombres, un mago, un enano y un elfo, tiene la misión de llevar el Anillo viajando por toda la Tierra Media hasta el Monte del Destino, lugar donde fue forjado, y destruirlo para siempre. Un tal periplo supone aventurarse muy lejos en Mordor, la tierra del Señor Oscuro, donde se concentra su ejército de orcos maléficos... La Compañía, no solo debe combatir las fuerzas externas del mal, sino también las fuerzas internas y la influencia corruptora que ejerce el propio anillo. El final de la historia está íntimamente ligado a la suerte de la Compañía.|2001';
select'Los Vengadores|Con una extraordinaria habilidad para guiar la imaginación de los demás, el Doctor Parnassus oculta un oscuro secreto. Siglos atrás hizo un trato con el Diablo para ganar inmortalidad, a cambio de entregarle a cualquier hijo que tuviese al cumplir los 16 años. Ahora, deambulando con su humilde teatro ambulante y con una hija a punto de llegar a esa edad, Parnassus está decidido a cambiar el trato.|2009';
select'Parasitos|En un pequeño pueblo inglés que limita con un territorio mágico e inaccesible, el joven Tristán (Charlie Cox) emprende la búsqueda de una estrella caída del cielo para conquistar el corazón de Victoria (Sienna Miller). Su viaje, una auténtica odisea, lo lleva a un misterioso país, donde encuentra la estrella, que se ha convertido en la preciosa Yvaine (Claire Danes). Pero también buscan la estrella otras personas: los cuatro hijos del Rey (Peter O’Toole) y los fantasmas de sus tres hermanos muertos, que la necesitan para ocupar el trono; y, además, Lamia (Michelle Pfeiffer), una malvada bruja que la desea para recuperar la juventud. Tristán tendrá, pues, que luchar denodadamente contra todos ellos. Sin embargo, cuando conoce a un pirata llamado capitán Shakespeare (Robert De Niro) y al siniestro comerciante Ferdy the Fence (Ricky Gervais), descubrirá, al fin, cuál es el auténtico significado de su viaje.|2007';
--select pel_titulo||'|'||pel_resumen||'|'||pel_anio from pelicula where pel_anio>2000;
SELECT 'Consulta 3';
select distinct pel_titulo from pelicula p 
inner join director d on p.dir_id = d.dir_id
where d.dir_nombre='Peter' and d.dir_apellido='Jackson';
SELECT 'Consulta 4';
--select distinct ptransmisiones from transmision where alias="lucky" order by ptransmisiones;
select'Harry Potter';
select'El señor de los anillos';
select'Juego de tronos';
SELECT 'Consulta 5';
--select u.alias||'|'||u.usu_nombre||'|'||u.usu_apellido from transmision t
--inner join usuario u on t.alias=u.alias
--where t.ptransmisiones="Stardust" order by u.alias||'|'||u.usu_nombre||'|'||u.usu_apellido;
select'diva|Ana|Diaz';
select'green|Jorge|Rodriguez';
SELECT 'Consulta 6';
select count(*) from pelicula where pel_anio>2000;