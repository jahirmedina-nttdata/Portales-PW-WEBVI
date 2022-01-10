Feature: CAP_F_013 - Navegar a Datos De Interes
  As un usuario registrado
  I quiero navegar a Datos de Interes
  So clickar en titulo "Datos de Interes"

  Background:
    Given CAPF013 - Cargando el Navegador

  @CAP_F_013
  Scenario Outline: Compartir la ficha de un Espacio Natural
    When CAPF013 - Se haya cargado la pagina
    And CAPF013 - Aceptar las cookies
    And CAPF013 - Ingresar el Nombre de Usuario "<user>"
    And CAPF013 - Ingresar la Clave de Usuario "<pass>"
    And CAPF013 - Acceder
    And CAPF013 - Cambiar a "<URL>" Especifica
    And CAPF013 - Clickar en pestaña "<pestana1>"
    And CAPF013 - Desplazarse a "<titulo1>"
    And CAPF013 - Click en Figuras de Proteccion : "<card1>"
    And CAPF013 - Clickar en pestaña "<pestana2>"
    And CAPF013 - Desplazarse a "<titulo2>"
    And CAPF013 - Click en Ficha Tecnica : "<card2>"
    Examples:
      | user | pass | URL | pestana1 | titulo1 | card1 | titulo2 | pestana2 | card2 |
      | cmaot_testing | Liferay*21 | https://www.juntadeandalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035 | DATOS DE INTERÉS | OTRAS FIGURAS DE PROTECCIÓN | Zona de Especial Conservación (Z.E.C.) | DATOS DE INTERÉS | FICHA TÉCNICA | Instrumentos de planificación |