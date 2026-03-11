
**Titel:** SimpleNote - Containerisierte Notizverwaltung

**Beteiligte:** [Deshan Kotalawalage] & [Damian Segginger]

### 1. Container-Struktur
Die Applikation besteht aus drei Containern:
* **Frontend-Container:** Serviert die statischen Dateien (HTML, CSS, JS) via Nginx.
* **Backend-Container:** Java Spring Boot Applikation (REST API).
* **Datenbank-Container:** MySQL-Instanz zur persistenten Speicherung der Notizen.

### 2. Tech-Stack
* **Backend:** Java mit Spring Boot (Spring Data JPA, Spring Web).
* **Frontend:** HTML5, CSS3, JavaScript (Vanilla oder Fetch API).
* **Datenbank:** MySQL 8.0.
* **Infrastruktur:** Docker, Docker Compose, Dev Container für VS Code.

### 3. Funktionalitäten
* Erstellen, Lesen, Aktualisieren und Löschen von Notizen (CRUD).
* Persistente Speicherung der Notizen in der MySQL-Datenbank.
* Web-Oberfläche zur Interaktion mit den Notizen.
* *Bonus-Ziel:* Ein vierter Container (z.B. ein Redis-Cache oder ein Mail-Service-Dummy) zur Kommunikation mit dem Backend.
