<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="list" action="index">Karyawan list</g:link></li>
            </ul>
        </div>
        <div id="show-karyawan" class="content scaffold-show" role="main">
            <f:display bean="karyawan" />
            <g:form resource="${this.karyawan}" method="DELETE">
                <fieldset class="buttons">
                    <input class="delete" type="submit" value="delete" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>