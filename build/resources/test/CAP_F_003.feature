Feature: CAP_F_003 - Valorar publicacion de blog
  As un usuario comun
  I quiero valorar el contenido de un post
  So seleccionar el valor por el cual se valorara

  Background:
    Given CAPF003 - Cargando el Navegador

  @CAP_F_003
  Scenario Outline: Cargando el Post a Valorar
    When CAPF003 - Se haya cargado el blog
    And CAPF003 - Aceptar las cookies
    Then CAPF003 - Valorar el Post con : "<valoracion>"
    Examples:
      | valoracion |
      | 1          |
      | 2          |
      | 3          |
      | 4          |
      | 5          |

