Feature: CAP_F_008 - Agregar a Pasaporte Ecoturista
  As un usuario registrado
  I quiero agregar una ficha a Pasaporte Ecoturista
  So clickar en icono "Añadir Pasaporte"

  Background:
    Given CAPF008 - Cargando el Navegador

  @CAP_F_008
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF008 - Se haya cargado la pagina
    And CAPF008 - Aceptar las cookies
    And CAPF008 - Ingresar el Nombre de Usuario "<user>"
    And CAPF008 - Ingresar la Clave de Usuario "<pass>"
    And CAPF008 - Acceder
    And CAPF008 - Cambiar a "<URL>" Especifica
    And CAPF008 - Agregar a Pasaporte Ecoturista
    And CAPF008 - Eliminar de Pasaporte Ecoturista
    Examples:
      | user | pass | URL |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 |