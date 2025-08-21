# 🎮 Sudoku em Java  

Um jogo de **Sudoku** desenvolvido em **Java** como parte de um desafio da [DIO].  
O projeto utiliza **Programação Orientada a Objetos (POO)** e está estruturado em camadas para facilitar manutenção e evolução.  
Além disso, conta com uma **interface gráfica em Swing**, permitindo uma experiência visual e interativa.  

---

## ✨ Funcionalidades  

✔️ Interface gráfica com botões interativos  
✔️ Reinício do tabuleiro a qualquer momento  
✔️ Verificação do status do jogo  
✔️ Finalização da partida  
✔️ Validação de números inseridos  
✔️ Estrutura modular e escalável  

---

## 🗂️ Estrutura do Projeto  

```bash
src/br/com/dio/
│── Main.java              # Ponto de entrada do programa
│── UIMain.java            # Inicialização da interface gráfica
│
├── model/                 # Camada de modelos (entidades do jogo)
│   ├── Board.java
│   ├── Space.java
│   └── GameStatusEnum.java
│
├── service/               # Camada de serviços e regras de negócio
│   ├── BoardService.java
│   ├── NotifierService.java
│   ├── EventListener.java
│   └── EventEnum.java
│
├── ui/custom/             # Camada de UI customizada
│   ├── button/            # Botões personalizados (Reset, Finish, Check)
│   ├── frame/             # Janela principal
│   ├── input/             # Campos de entrada numérica
│   ├── panel/             # Painéis do jogo
│   └── screen/            # Tela principal
│
└── util/
    └── BoardTemplate.java # Estrutura base do tabuleiro

