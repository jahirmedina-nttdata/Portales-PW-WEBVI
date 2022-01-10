Feature: CAP_F_016A - Buscar Contenido en la Web de Portales (Buscador Audios)
  As un usuario comun
  I quiero buscar contenido en la web de audios
  So escribir el termino a buscar y presionar enter

  Background:
    Given CAPF016A - Cargando el Navegador

  @CAP_F_016A
  Scenario Outline: Cargando la pagina en donde se buscara
    When CAPF016A - Se haya cargado la web
    And CAPF016A - Aceptar las cookies
    And CAPF016A - Escribir "<txtBusqueda>" y Buscar
    And CAPF016A - Abrir Busqueda Avanzada
    And CAPF016A - Escribir Desde Que Fecha Buscar : "<desde>"
    And CAPF016A - Escribir Hasta Que Fecha Buscar : "<hasta>"
#    And CAPF016A - Retomar Busqueda
#    And CAPF016A - Abrir Busqueda Avanzada
    And CAPF016A - Seleccionar Tema : "<numero>"
    And CAPF016A - Retomar Busqueda
    Examples:
      | txtBusqueda | desde | hasta | numero  |
      | Bio  |  20/11/2017  | 01/01/2019  | 5 |
      | Fauna  |  20/11/2017  | 01/01/2019  | 5 |

