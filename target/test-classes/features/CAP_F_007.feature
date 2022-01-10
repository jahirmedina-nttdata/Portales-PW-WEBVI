Feature: CAP_F_007 - Compartir la ficha de un Espacio Natural
  As un usuario registrado
  I quiero compartir a una ficha en redes sociales
  So clickar en iconos para publicar en redes sociales

  Background:
    Given CAPF007 - Cargando el Navegador

  @CAP_F_007
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF007 - Se haya cargado la pagina
    And CAPF007 - Aceptar las cookies
    And CAPF007 - Ingresar el Nombre de Usuario "<user>"
    And CAPF007 - Ingresar la Clave de Usuario "<pass>"
    And CAPF007 - Acceder
    And CAPF007 - Cambiar a "<URL>" Especifica
    And CAPF007 - Publicar en Facebook
    And CAPF007 - Publicar en Twitter
    And CAPF007 - Publicar en Pinterest
    And CAPF007 - Publicar en Whatsapp
    And CAPF007 - Publicar por email
    Examples:
      | user | pass | URL |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 |