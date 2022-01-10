Feature: CAP_F_028 - Navegar a apartado "No te vayas sin"
  As un usuario registrado
  I quiero navegar a apartado "No te vayas sin"
  So clickar en apartado "No te vayas sin"

  Background:
    Given CAPF028 - Cargando el Navegador

  @CAP_F_028
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF028 - Se haya cargado la pagina
    And CAPF028 - Aceptar las cookies
    And CAPF028 - Ingresar el Nombre de Usuario "<user>"
    And CAPF028 - Ingresar la Clave de Usuario "<pass>"
    And CAPF028 - Acceder
    And CAPF028 - Cambiar a "<URL>" Especifica
    And CAPF028 - Clickar en "No te vayas sin...Disfrutar de sus Playas"
    Examples:
      | user | pass | URL |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 |