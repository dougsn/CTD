# 1 - Listar todos os países que contêm a letra A, ordenados alfabeticamente.

select * from dhtube.pais as pais
where pais.nome like '%A%'
order by pais.nome;

# 2 - Gere uma lista de usuários, com detalhes de todos os seus dados, o avatar que possuem e a qual país pertencem.

select  usuario.*,
        avatar.nome,
        avatar.urlimagem,
        pais.nome
from dhtube.usuario as usuario
inner join dhtube.avatar as avatar on avatar.idAvatar = usuario.Avatar_idAvatar
inner join dhtube.pais as pais on pais.idPais = usuario.Pais_idPais;


# 3 - Faça uma lista com os usuários que possuem playlists, mostrando a quantidade que possuem.

select  
        usuario.nome,
        count(playlist.idPlaylist) as qtd_playlist
from dhtube.playlist as playlist
inner join dhtube.usuario as usuario on usuario.idUsuario = playlist.usuario_idUsuario
group by usuario.nome;

# 4 - Mostrar todos os canais criados entre 01/04/2021 e 01/06/2021.

select * 
from dhtube.canal as canal
where canal.dataCriacao between '2021-04-01' and '2021-06-01';

# 5 - Mostre os 5 vídeos com a menor duração, listando o título do vídeo, a tag ou tags que possuem, o nome de usuário e o país ao qual correspondem.

 # *Corrigir o problema de replicação do titulo_video* #
 
select  video.titulo as titulo_video ,
		video.duracao as duracao_video,
		usuario.nome as nome_usuario,
        pais.nome as pais_usuario,
		hashtag.nome as hashtag
from dhtube.video as video 
inner join dhtube.usuario as usuario on usuario.idUsuario = video.usuario_idUsuario
inner join dhtube.pais as pais on pais.idPais = usuario.Pais_idPais
inner join dhtube.video_hashtag as video_hashtag on video_hashtag.video_idVideo = video.idVideo
inner join dhtube.hashtag as hashtag on hashtag.idHashtag = video_hashtag.hashtag_idHashtag
order by video.duracao
limit 5;

# 6 - Liste todas as playlists que possuem menos de 3 vídeos, mostrando o nome de usuário e avatar que possuem

select  video.titulo as titulo_video,
		count(distinct (playlist.nome) ) qtd_video
from dhtube.video as video
inner join dhtube.playlist_video as pv on video.idVideo = pv.video_idVideo
inner join dhtube.playlist as playlist on pv.Playlist_idPlaylist = playlist.idPlaylist
group by video.titulo
having qtd_video <= 3
order by qtd_video;


# 7 - Insira um novo avatar e atribua-o a um usuário.

insert into dhtube.avatar (nome, urlImagem)
values ('DH Hero', 'https://www.google.com/search?q=DH Hero'); # Criou o ID 86, podendo ser outro.

update dhtube.usuario
set Avatar_idAvatar = 86
where idUsuario = 1;

# 8 - Gere um relatório de estilo de classificação de avatares usados por país.

select  usuario.nome,
		avatar.nome,
		pais.nome
from dhtube.usuario as usuario
inner join dhtube.pais as pais on pais.idPais = usuario.Pais_idPais
inner join dhtube.avatar as avatar on avatar.idAvatar = usuario.Avatar_idAvatar
order by pais.nome;


# 9 - Insirar dados do usuário.

insert into dhtube.pais (nome)
values ('Digital_House'); # ID gerado - 196

insert into dhtube.avatar (nome, urlImagem)
values ('DH Hero 2', 'https://www.google.com/search?q=DH Hero 2'); # ID gerado - 87

insert into dhtube.usuario (nome, email, senha, dataNascimento, codigoPostal, Pais_IdPais, Avatar_idAvatar)
values ('DOUGLAS NASCIMENTO', 'DOUGLAS@gmail.com', 'ABC123!', '1999-03-09 00:00:00', '5569', 196, 87); # ID gerado - 22

# 10 - Gere um relatório de todos os vídeos e suas hashtags, mas apenas aqueles cujos nomes de hashtags contêm menos de 10 caracteres,  classificados em ordem crescente pelo número de caracteres na hashtag.

select  video.descricao,
		hashtag.nome as hashtag
from dhtube.video as video
inner join dhtube.video_hashtag as video_hashtag on video_hashtag.video_idVideo = video.idVideo
inner join dhtube.hashtag as hashtag on hashtag.idHashtag = video_hashtag.hashtag_idHashtag
where length(hashtag.nome) < 10
order by hashtag;








