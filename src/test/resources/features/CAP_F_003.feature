Feature: CAP_F_003 - Iniciar Sesion en Pagina del Visitante
  As un usuario registrado
  I quiero iniciar sesion
  So ingreso mis credenciales

  Background:
    Given CAPF003 - Cargando el Navegador

  @CAP_F_003
  Scenario Outline: Iniciar Sesion en Pagina del Visitante
    When CAPF003 - Se haya cargado la pagina
    And CAPF003 - Aceptar las cookies
    And CAPF003 - Ingresar el Nombre de Usuario "<user>"
    And CAPF003 - Ingresar la Clave de Usuario "<pass>"
    And CAPF003 - Acceder
    Examples:
      | user | pass |
      | cmaot_testing | Liferay*21 |