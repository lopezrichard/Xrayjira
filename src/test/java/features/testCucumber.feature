Feature: TestCucumber

	@TEST_QAA-14
  Scenario: ingreso con credenciales correctas
    Given que ingresas a la web
    When el usuario ingresas sus credenciales validas
    Then ingresas sastifactoriamente al home
