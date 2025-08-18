# 💻 Encurtador de URL (Console .EXE)

![Java](https://img.shields.io/badge/Java-17-red?logo=java)
![Executable](https://img.shields.io/badge/Executable-.exe-lightgrey?logo=windows)
![License](https://img.shields.io/github/license/Dev1Nate/Encurtador-de-URL-Exe)

Aplicação de console em **Java**, que consome um executável (`shortener.exe`) para encurtar URLs digitadas pelo usuário.  
Projeto simples para uso direto no **terminal**.

---

## ⚙️ Tecnologias Utilizadas
- **Java 17+**
- **Executável externo (`shortener.exe`)**
- **JAR executável (`pjt-exe.jar`)**

---

## 🚀 Funcionalidades
- O usuário digita ou cola uma URL no terminal
- O programa chama `shortener.exe` via `ProcessBuilder`
- O resultado é exibido no console
- Tratamento básico de erros em caso de falha na URL

---

## 📌 Estrutura do Projeto
```
dist/
 └── Scripts/
     ├── Main.java       → Código fonte principal
     ├── pjt-exe.jar     → JAR executável do projeto
     ├── shortener.exe   → Script/execução responsável pelo encurtamento
     └── encurtador.exe  → (opcional) versão alternativa do encurtador
```

---

## 🛠️ Como Executar

### 1️⃣ Executar diretamente no terminal (via JAR)
```bash
cd dist/Scripts
java -jar pjt-exe.jar
```

### 2️⃣ Compilar e rodar manualmente (caso queira usar o `.java`)
```bash
javac Main.java
java Scripts.Main
```

### Fluxo esperado:
```
Copie Ou Digite Sua URL: https://google.com
http://encurtado.com/xyz123
```

---

## ⚠️ Tratamento de Erros
Se algo der errado (por exemplo, URL inválida), o programa exibe:
```
Erro Na URL: java.lang.RuntimeException: ...
```

---

## 📜 Licença
Distribuído sob a licença **GPL-3.0**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

## ✨ Melhorias Futuras
- [ ] Melhorar o tratamento de erros e mensagens ao usuário  
- [ ] Permitir múltiplas URLs em sequência  
- [ ] Criar versão multiplataforma (Linux/Mac) sem depender de `.exe`  
- [ ] Integrar com a **API Encurtador de URL** para maior flexibilidade  

---

## 👨‍💻 Autor
Desenvolvido por **[Dev1Nate](https://github.com/Dev1Nate)** 🚀
