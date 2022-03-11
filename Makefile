test-dive:
	dive --ci --config=cicd/dive-config.yaml hello-world:latest

test-dockle:
	dockle --exit-code 1 --exit-level fatal hello-world:latest

test-trivy:
	trivy image golang:1.16

install-all:
	$(MAKE) -C cicd -f Makefile.install install-extra-tools

install-ci-tools:
<<<<<<< HEAD
	$(MAKE) -C cicd -f Makefile.install \
	install-dive \
	install-dockle \
	install-trivy \
=======
	$(MAKE) -c cicd -f Makefile.install \
	install-dive
	install-dockle
	install-trivy
>>>>>>> 7377b18... fix(release): fix concurrent jobs execution
	install-docker-slim

create-environment:
	$(MAKE) -C cicd -f Makefile.k3d create