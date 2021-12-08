Feature: CAP_F_005 - Acceso a la ficha de un Espacio Natural
  As un usuario registrado
  I quiero acceder a una ficha
  So seleccionar la ficha

  Background:
    Given CAPF005 - Cargando el Navegador

  @CAP_F_005
  Scenario Outline: Acceso a la ficha de un Espacio Natural
    When CAPF005 - Se haya cargado la pagina
    And CAPF005 - Aceptar las cookies
    And CAPF005 - Ingresar el Nombre de Usuario "<user>"
    And CAPF005 - Ingresar la Clave de Usuario "<pass>"
    And CAPF005 - Acceder
    And CAPF005 - Cambiar a "<URL>" Especifica
    Examples:
    | user | pass | URL |
    | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 |