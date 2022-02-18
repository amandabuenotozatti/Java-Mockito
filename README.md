## Mocks em Java com Mockito
> O objetivo desse curso é aprender e praticar sobre a utilização dos Mocks nos testes. Quando vamos escrever um teste ele possui algumas dependências de outras classes externas, só que essas classes executam algum serviço externo, como por exemplo acesso ao banco de dados, e às vezes não queremos ter essa integração com o banco de dados. Sendo a intenção testar apenas aquela classe, com determinada lógica que aquela classe tem de maneira isolada das outras do projeto precisamos utilizar os Mocks. 

### Iniciando com Mockito
- O que são mocks e quando utilizá-los
- Configurar o projeto utilizado no curso
- Configurar o Mockito na aplicação
- Escrever uma classe de teste que utiliza o Mockito
- Criar um mock utilizando o Mockito

### Escrevendo testes com Mockito
- Como passar um mock para uma classe via construtor
- Como utilizar a anotação @Mock para marcar um atributo como sendo um mock
- Como utilizar os métodos when e thenReturn para alterar o retorno padrão de um método no mock
- Como utilizar o método verify para checar se o mock teve um determinado método chamado

### Lidando com Exceptions
- Como lidar com exceptions ao utilizar mocks
- Como utilizar o método thenThrow para configurar um mock para lançar uma exception

### Recurso de Argument Captor
- Os problemas de se fazer chamadas a métodos estáticos quando precisamos escrever testes automatizados com a utilização de mocks
- A como pensar em abstrações para substituir chamadas a métodos estáticos
