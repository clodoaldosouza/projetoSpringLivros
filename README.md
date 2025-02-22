# Adiconando registros via cmd, bash ou powershell

Use os comandos abaixo para adicionar dados ao banco:
## Exemplos usando o CMD do Windows ou o Bash do git:

curl -X POST http://localhost:8080/livros -H "Content-Type: application/json" -d "{\"asin\": \"B0B2HPDDGF\", \"titulo\": \"Head First Java: A Brain-Friendly Guide\", \"autor\": \"Kathy Sierra\"}"

curl -X POST http://localhost:8080/livros -H "Content-Type: application/json" -d "{\"isbn\": 1617298697, \"asin\": \"B09HJLK2BN\", \"titulo\": \"Spring Start Here: Learn what you need and learn it well\", \"autor\": \"Laurentiu Spilca\"}"


## Exemplos usando o PowerShell do Windows

Invoke-RestMethod -Uri "http://localhost:8080/livros" -Method Post -ContentType "application/json" -Body '{"isbn": 1617298697, "asin": "B09HJLK2BN", "titulo": "Spring Start Here: Learn what you need and learn it well", "autor": "Laurentiu Spilca"}'

Invoke-RestMethod -Uri "http://localhost:8080/livros" -Method Post -ContentType "application/json" -Body '{"asin": "B0B2HPDDGF", "titulo": "Head First Java: A Brain-Friendly Guide", "autor": "Kathy Sierra"}'
