select f.d_fat, 
       sum(f.total) as vlr_tota
  from musimundos.clientes cli
inner join
    ( select sf.id_cliente as id_cli, sf.data_fatura as d_fat, sf.valor_total as total
        from musimundos.faturas sf 
     where year(sf.data_fatura) = 2010
     ) as f
on f.id_cli = cli.id
group by f.d_fat ;