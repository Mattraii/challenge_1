Github workflow es · MD
## Cómo entregar la práctica
 
### 1. Haz un fork
Haz clic en el botón **Fork** (arriba a la derecha). GitHub creará una copia del repositorio en tu cuenta.
 
### 2. Clona tu fork
Copia la URL de **tu fork** y ejecútala en la terminal:
```bash
git clone <url-de-tu-fork>
```
 
### 3. Crea una rama con tu nombre
```bash
git checkout -b feature/tu-nombre
```
 
### 4. Implementa la práctica
Cuando tengas el código listo:
```bash
git add .
git commit -m "feat: challenge resuelto"
git push origin feature/tu-nombre
```
 
### 5. Abre una Pull Request
1. Ve a tu fork en GitHub.
2. Haz clic en **Compare & Pull Request**.
3. Comprueba que la PR va de `feature/tu-nombre` → `main` de **tu fork** (no al repositorio del tutor).
4. Ponle un título y haz clic en **Create Pull Request**.
> ⚠️ **No hagas merge.** El tutor revisará tu código antes de aprobarlo.
