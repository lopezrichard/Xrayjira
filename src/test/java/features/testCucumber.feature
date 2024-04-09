Feature: ingreso con credenciales correctas

	@ECO-3
  Scenario Outline: ingreso con credenciales correctas
    Given que ingresas a la web
    When el usuario ingresas sus credenciales validas
    Then ingresas sastifactoriamente al home
    Examples:
      |test|
      |  test  |

 
