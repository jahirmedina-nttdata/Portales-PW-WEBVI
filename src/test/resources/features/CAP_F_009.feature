Feature: CAP_F_009 - Agregar a Favoritos
  As un usuario registrado
  I quiero agregar una ficha a Favoritos
  So clickar en icono "Añadir Favoritos"

  Background:
    Given CAPF009 - Cargando el Navegador

  @CAP_F_009
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF009 - Se haya cargado la pagina
    And CAPF009 - Aceptar las cookies
    And CAPF009 - Ingresar el Nombre de Usuario "<user>"
    And CAPF009 - Ingresar la Clave de Usuario "<pass>"
    And CAPF009 - Acceder
    And CAPF009 - Cambiar a "<URL>" Especifica
    And CAPF009 - Agregar a Favoritos
    And CAPF009 - Eliminar de Favoritos
    Examples:
      | user | pass | URL |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 |