<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="show" resource="${this.karyawan}" action="show">Back to detail</g:link></li>
            </ul>
        </div>

        <div id="update-karyawan" class="content scaffold-update" role="main">
            <g:form resource="${this.karyawan}" method="PUT">
                <fieldset class="form">
                    <f:all bean="karyawan"/>
                </fieldset>
                <fieldset class="buttons">
                    <g:submitButton name="update" class="update" value="Update" />
                </fieldset>
            </g:form>
        </div>
    </body>
</html>