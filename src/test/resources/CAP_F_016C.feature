Feature: CAP_F_016C - Buscar Contenido en la Web de Portales (Buscador Audios)
  As un usuario comun
  I quiero buscar contenido en la web de audios
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF016C - Cargando el Navegador

  @CAP_F_016C
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF016C - Se haya cargado la web
    And CAPF016C - Aceptar las cookies
    And CAPF016C - Escribir "<txtBusqueda>" y Buscar
    And CAPF016C - Abrir Busqueda Avanzada
    And CAPF016C - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF016C - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF016C - Retomar Busqueda
#    And CAPF016C - Abrir Busqueda Avanzada
    And CAPF016C - Seleccionar Tema : "<numero>"
    And CAPF016C - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |

