# interface
Projeto voltado para aprendizagem de um dos pilares da Orientação a Objeto através de um exercicio problema que utiliza tal implementação

# inversão de controle
    Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências
# injeção de dependência
    É uma forma de realizar inversão de controle: um componente externo instancia a dependência,
    que é então injetada no objeto "pai".
    Pode ser implementada de várias formas:
        -> Construtor
        -> Classe de instanciação ( builder/factory )
        -> Container / Framework
    Exemplo: Injecao de dependencia ao instanciar BrazilTaxService no construtor de RentalService,
              a classe RentalService nao possui a responsabilidade de definir quem esta fazendo a interface e sim 
              outra classe que a esta utilizando 
              .: ao utilizar new BrazilTaxService() e um upcasting de TaxService :.
