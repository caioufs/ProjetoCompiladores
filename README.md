# ProjetoCompiladores
Repositorio do projeto de compiladores 2023.1

## Instruções de Alteração

Alterem somente os arquivos contidos na pasta Entregas!!!(.sable)

## Instruções de Execução

### Léxico

(Eclipse) Para a execução do projeto léxico importe o projeto para o eclipse,
Rode o arquivo grupo22.sable, e logo em seguida pode ser executada a classe Main.

### Sintático

(Eclipse) Para a execução do projeto sintatico importe o projeto para o eclipse,
Rode o arquivo grupo22.sable, e logo em seguida pode ser executada a classe Main.

#### Importante

Atencao para o sintatico mudar o main do arquivo TreeDumper.java da seguinte forma:

```bash
    public static void main(String[] args) {
        String expr = args.length == 0 ? "(1+2)*3" : args[0];
        Parser parser = new Parser(new Lexer(new PushbackReader(new StringReader(expr))));

        try {
            Start start = parser.parse();
            // ---- Essa Linha Tem que ser desse forma ----
            start.getPPrograma().apply(new TreeDumper(new PrintWriter(System.out)));
            // --------------------------------------------
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
```

``OBS: Os arquivos: Lexer, Node, Parser e Analysis serão criados ao executar a Main``

## Entregas

Análise Léxica (Etapa 2) : 24/07/2023 às 23:59

Análise Sintática (Etapa 3) : 30/08/2023 às 23h 59

Análise Abstrata (Etapa 4) : 18/09/2023 às 23h 59

Análise Sêmantica (Etapa 5) : 04/10/2023 às 23h 59

(Extra) Geração de código (Etapa 6): 04/10/2023 às 23h 59