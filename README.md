# Cadastro de Ninjas API

API REST desenvolvida com Spring Boot para gerenciamento de ninjas e missões.

---

## 📖 Visão Geral

Esta aplicação permite:

- Criar ninjas
- Deletar ninjas
- Criar missões
- Relacionar ninjas com missões

---

## 🧱 Arquitetura

O projeto segue uma estrutura simples baseada em:

Controller → Repository → Banco de Dados

### 📌 Camadas:

- **Controller**: recebe as requisições HTTP
- **Repository**: faz a comunicação com o banco
- **Model**: representa as entidades (tabelas)

---

## 🥷 Entidade: Ninja

Tabela: `tb_cadastro`

| Campo    | Tipo   | Descrição              |
|----------|--------|-----------------------|
| id       | Long   | Identificador único   |
| nome     | String | Nome do ninja         |
| email    | String | Email                 |
| idade    | int    | Idade                 |
| missoes  | Objeto | Missão associada      |

### 🔗 Relacionamento
- Um ninja pertence a **uma missão** (`@ManyToOne`)

---

## 🎯 Entidade: Missão

Tabela: `tb_missoes`

| Campo        | Tipo   | Descrição              |
|--------------|--------|-----------------------|
| id           | Long   | Identificador         |
| nome         | String | Nome da missão        |
| dificuldade  | String | Nível da missão       |
| ninja        | Lista  | Lista de ninjas       |

### 🔗 Relacionamento
- Uma missão possui **vários ninjas** (`@OneToMany`)

---

## 🌐 Endpoints

### 🥷 Ninja

#### ➕ Criar Ninja
POST /ninja

**Body:**
```json
{
  "nome": "Naruto",
  "email": "naruto@email.com",
  "idade": 17,
  "missoes": {
    "id": 1
  }
}
```

---

#### ❌ Deletar Ninja
DELETE /ninja/{id}

**Resposta:**
"Ninja deletado com sucesso!"

**Erro:**
"Ninja não encontrado"

---

### 🎯 Missões

#### ➕ Criar Missão
POST /missoes

**Body:**
```json
{
  "nome": "Missão Rank A",
  "dificuldade": "Alta"
}
```

---

## 🗄️ Banco de Dados

### Tabela: tb_cadastro
- id
- nome
- email
- idade
- missoes_id (FK)

### Tabela: tb_missoes
- id
- nome
- dificuldade

---

## ⚙️ Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok

---

## ▶️ Como executar o projeto

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repo.git

# Acesse a pasta
cd seu-repo

# Execute o projeto
./mvnw spring-boot:run
```

---

## 👨‍💻 Autor

Mauricio Dill

---

## 📌 Licença

Este projeto é para fins de estudo.
