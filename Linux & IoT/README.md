# Linux

- GNU/Linux
- Android/Linux
- */Linux

### touchscript.sh
```sh
if touch $1; then
echo "WE FUCKED IT UP"
else
echo "of nz ko stana ama ne stana kat horata"
$()
fi

```

### четене на редове
```sh
cat /etc/passwd | \
while read LINE
do
    echo $LINE
done

```

## Домашно #1

```
Да се напише като шел-скрипт машина за прилагане на шаблони

 a) Имаме точно 9 параметъра - от PARAM1 до PARAM9. Техните стойности се намират в променливи от обкръжението

 б) Параметрите имат произволни имена. напр. @PARAMxxx@ или @Alabalazzz@

 в) Параметрите имат произволни имена, но стойностите се намират в отделен файл със следния вид:
 PARAMxxx=value1
 PARAMxxy=value2
 
 г) Всички от в) + параметритре трябва да се заместват рекурсивно.

 д) Всичко от в) или г) + възможност за буквално @ по следния начин: \@. Backslash е: \\.
```