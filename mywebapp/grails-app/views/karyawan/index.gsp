<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
    </head>
    <body>
        <div class="nav" role="navigation">
            <ul>
                <li><g:link class="create" action="create">Create</g:link></li>
            </ul>
        </div>
        <div id="list-karyawan" class="content scaffold-list" role="main">
            <f:table collection="${karyawanList}"
                properties="['nama', 'alamat', 'jabatan', 'umur', 'lamaKerja']" />
        </div>
    </body>
</html>