Feature: CAP_F_021 - Navegar a Actividades
  As un usuario registrado
  I quiero navegar a Actividades
  So clickar en titulo "Actividades"

  Background:
    Given CAPF021 - Cargando el Navegador

  @CAP_F_021
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF021 - Se haya cargado la pagina
    And CAPF021 - Aceptar las cookies
    And CAPF021 - Ingresar el Nombre de Usuario "<user>"
    And CAPF021 - Ingresar la Clave de Usuario "<pass>"
    And CAPF021 - Acceder
    And CAPF021 - Cambiar a "<URL>" Especifica
    And CAPF021 - Clickar en pestaña "<pestana1>"
    And CAPF021 - Clickar en Enlace a Reserva Tu Visita
    Examples:
      | user | pass | URL | pestana1 |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | ACTIVIDADES |