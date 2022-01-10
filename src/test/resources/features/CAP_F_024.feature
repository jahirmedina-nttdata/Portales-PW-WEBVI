Feature: CAP_F_024 - Navegar a Publicaciones
  As un usuario registrado
  I quiero navegar a Publicaciones
  So clickar en titulo "Publicaciones"

  Background:
    Given CAPF024 - Cargando el Navegador

  @CAP_F_024
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF024 - Se haya cargado la pagina
    And CAPF024 - Aceptar las cookies
    And CAPF024 - Ingresar el Nombre de Usuario "<user>"
    And CAPF024 - Ingresar la Clave de Usuario "<pass>"
    And CAPF024 - Acceder
    And CAPF024 - Cambiar a "<URL>" Especifica
    And CAPF024 - Clickar en pestaña "<pestana1>"
    And CAPF024 - Clickar en Publicacion : "<tituloPublicacion>"
    Examples:
      | user | pass | URL | pestana1 | tituloPublicacion |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | PUBLICACIONES | ¡Cuidado con las garrapatas! |