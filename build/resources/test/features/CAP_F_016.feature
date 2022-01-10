Feature: CAP_F_016 - Navegar a Mapa
  As un usuario registrado
  I quiero navegar a Mapa
  So clickar en titulo "Mapa"

  Background:
    Given CAPF016 - Cargando el Navegador

  @CAP_F_016
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF016 - Se haya cargado la pagina
    And CAPF016 - Aceptar las cookies
    And CAPF016 - Ingresar el Nombre de Usuario "<user>"
    And CAPF016 - Ingresar la Clave de Usuario "<pass>"
    And CAPF016 - Acceder
    And CAPF016 - Cambiar a "<URL>" Especifica
    And CAPF016 - Clickar en pestaña "<pestana1>"
#    And CAPF016 - Desplazarse a "<titulo1>"
#    And CAPF016 - Click en Figuras de Proteccion : "<card1>"
#    And CAPF016 - Clickar en pestaña "<pestana2>"
#    And CAPF016 - Desplazarse a "<titulo2>"
#    And CAPF016 - Click en Ficha Tecnica : "<card2>"
    Examples:
      | user | pass | URL | pestana1 | titulo1 | card1 | titulo2 | pestana2 | card2 |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | MAPA | OTRAS FIGURAS DE PROTECCIÓN | Zona de Especial Conservación (Z.E.C.) | DATOS DE INTERÉS | FICHA TÉCNICA | Instrumentos de planificación |