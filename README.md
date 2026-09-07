# System Hard Life

> Um SaaS (Software as a Service) em desenvolvimento, voltado para a gestão de estúdios e profissionais de bem-estar.

---

## Sobre o Projeto

O System Hard Life é um projeto em construção e de caráter prático/iniciante, criado com o objetivo de aplicar conceitos de desenvolvimento web full-stack, arquitetura de software e novas tecnologias à medida que vou evoluindo meus conhecimentos. O sistema conta com uma Landing Page institucional e um Painel de Controle (Dashboard) funcional.

---

## Status do Projeto

Em desenvolvimento contínuo. Novas funcionalidades, melhorias de arquitetura e módulos são adicionados incrementalmente conforme o progresso nos estudos.

---

## Principais Funcionalidades Atuais

- **Landing Page Institucional:** Apresentação com identidade visual moderna (Slate & Crimson), botões de ação (CTA) e botão flutuante para contato via WhatsApp.
- **Autenticação de Usuários:** Fluxo básico de login e cadastro com gerenciamento de sessão no navegador.
- **Painel de Controle (Dashboard):** 
  - Visão geral com métricas simuladas (Alunos ativos, Aulas do dia e Faturamento).
  - Tabela de alunos recentes.
  - Menu lateral e encerramento seguro de sessão (Logout).

---

## Tecnologias Utilizadas

- **Back-end:** Java com Spring Boot, PostgreSQL.
- **Front-end:** HTML5, CSS3 e JavaScript puro.
- **Controle de Versão:** Git & GitHub.

---

## Estrutura do Projeto

```text
pilates-api/
├── src/
│   ├── main/
│   │   ├── java/com/seuprojeto/      # Controladores e regras da API Spring Boot
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── index.html          # Landing Page principal
│   │       │   ├── dashboard.html      # Painel interno autenticado
│   │       │   └── style.css           # Folha de estilos unificada
│   │       └── application.properties  # Configurações do banco e servidor
└── README.md
