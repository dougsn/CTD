DELIMITER //
CREATE PROCEDURE calculateSumAndAverage(IN input varchar(255), OUT sum int, OUT average float)
BEGIN
    SET sum = 0;
    SET @count = 0;
    SET @pos = LOCATE(';', input);
    WHILE @pos > 0 DO
        SET @num = SUBSTRING(input, 1, @pos - 1);
        SET input = SUBSTRING(input, @pos + 1);
        SET @pos = LOCATE(';', input);
        IF @num REGEXP '^[0-9]+\\.?[0-9]*$' AND CAST(@num AS DECIMAL(10,2)) > 0 THEN
            SET sum = sum + CAST(@num AS SIGNED);
            SET @count = @count + 1;
        END IF;
    END WHILE;
    SET average = sum / @count;
END
//
DELIMITER ;

SET @input = '10;66;138;37;-72;5;';
SET @sum = 0;
SET @average = 0;
SELECT @sum, @average;
CALL calculateSumAndAverage(@input, @sum, @average);