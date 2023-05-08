SELECT * FROM dhtube.video;

SELECT * FROM dhtube.video AS video
WHERE video.dtaPublicacao BETWEEN '2021-02-22 00:00:00' AND '2021-03-00 00:00:00';

SELECT * FROM dhtube.video AS video
WHERE video.qtdReproducoes <= 600000
ORDER BY video.qtdReproducoes DESC;

SELECT video.titulo, video.descricao, video.duracao, video.qtdReproducoes, max(video.qtdLikes) AS quantidade_Likes, video.qtdDislikes AS quantidade_DisLikes, video.dtaPublicacao 
FROM dhtube.video AS video
GROUP BY video.titulo
ORDER BY video.qtdLikes DESC
LIMIT 10;

