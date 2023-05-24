DELIMITER $$
create procedure musimundos.numeros (in numeros varchar(100), out soma double, out media double)
begin
    declare quantidade int default 0;
    set soma = 0;

    numeros_loop: loop
        set quantidade = quantidade + 1;
        case when (cast(left(numeros,locate(';',numeros)-1) as double) > 0 ) then
                set soma=soma + cast(left(numeros, locate(';',numeros)-1) as double);
             else set quantidade = quantidade - 1;
        end case;

        set numeros = right(numeros, char_length(numeros) - locate (';',numeros));

        if (locate(';', numeros) = 0 ) then 
                leave numeros_loop;
        end if;

    end loop;
    set media = soma / quantidade;

    end;
    $$

DELIMITER $$
call musimundos.numeros ('10;66;138;37;-72;-5;10;', @soma, @media);

select @soma, @media
$$