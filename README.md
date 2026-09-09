# Padrão Singleton — Configuração do Sistema

Este projeto demonstra a aplicação do padrão de projeto criacional **Singleton** em Java.

## Objetivo

Garantir que exista apenas **uma instância** da classe `Configuracao` durante a execução da aplicação, permitindo acesso global à mesma configuração.

## Conceitos-Chave para Estudo

**Instância Única:** O construtor da classe é privado e impede a criação de objetos diretamente com `new`.

**Acesso Global:** O método `getInstance()` fornece acesso à única instância de `Configuracao`.

**Controle de Estado:** Alterações feitas na configuração são mantidas na mesma instância.

**Uso de `static`:** A variável que armazena a instância e o método `getInstance()` são estáticos para permitir o acesso sem criar um objeto previamente.

**Aplicação Prática:** O padrão pode ser utilizado em configurações, gerenciadores, logs e outros componentes que devem possuir apenas uma instância.
