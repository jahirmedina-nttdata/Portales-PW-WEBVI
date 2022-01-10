Feature: CAP_F_029 - Navegar a apartado "Descargas"
  As un usuario registrado
  I quiero navegar a apartado "Descargas"
  So clickar en apartado "Descargas"

  Background:
    Given CAPF029 - Cargando el Navegador

  @CAP_F_029
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF029 - Se haya cargado la pagina
    And CAPF029 - Aceptar las cookies
    And CAPF029 - Ingresar el Nombre de Usuario "<user>"
    And CAPF029 - Ingresar la Clave de Usuario "<pass>"
    And CAPF029 - Acceder
    And CAPF029 - Cambiar a "<URL>" Especifica
    And CAPF029 - Desplazarse a Descarga
    And CAPF029 - Descargar Formato : "<formato>"
    Examples:
      | user | pass | URL | formato |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | KML |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | GML |